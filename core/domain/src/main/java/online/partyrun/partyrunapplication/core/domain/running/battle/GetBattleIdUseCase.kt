package online.partyrun.partyrunapplication.core.domain.running.battle

import online.partyrun.partyrunapplication.core.common.result.Result
import online.partyrun.partyrunapplication.core.data.repository.BattleRepository
import online.partyrun.partyrunapplication.core.model.battle.BattleId
import javax.inject.Inject

class GetBattleIdUseCase @Inject constructor(
    private val battleRepository: BattleRepository
) {
    suspend operator fun invoke(): Result<BattleId> =
        battleRepository.getBattleId()
}
